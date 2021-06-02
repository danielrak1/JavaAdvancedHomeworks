package LiveCoding;

import java.util.Stack;

/*Create a class imitating a weapon magazine.
The class should be able to define the size of the magazine
        using the constructor. Implement the methods:

        *loadBullet(String bullet) → adding a cartridge to the magazine,
        does not allow loading more cartridges
        than the capacity of the magazine

        *isLoaded() → returns information about whether the weapon
        is loaded (at least one cartridge) or not

        *shot() → each call shots one bullet (prints string value in
        console) - the last loaded cartridge - and
        prepares the next one, loaded before the last one,
        if there are no more cartridges, it prints "empty
        magazine" in the console
*/
public class Task7 {
    public static void main(String[] args) {
        WeaponMagazine AK47 = new WeaponMagazine(10);
        AK47.loadBullet("a");
        AK47.loadBullet("b");
        AK47.loadBullet("c");
        AK47.loadBullet("d");
        AK47.loadBullet("e");
        AK47.loadBullet("f");

        while(AK47.isLoaded()){
         AK47.shot();
        }
        AK47.shot();
    }
}

class WeaponMagazine {
    private int size;
    Stack<String> bullets = new Stack<>();

    public WeaponMagazine(int size) {
        this.size = size;
    }

    public void loadBullet(String bullet) {
        if ((bullets.size() + 1) > size) {
            System.out.println("Magazine is full. You cannot load more bullets!");
        } else {
            bullets.add(bullet);
        }

    }

    public boolean isLoaded() {
        return bullets.size() > 0;
        //return bullets.isEmpty();

    }

    public void shot() {
        if (bullets.size()>0) {
            String bullet = bullets.pop();
            System.out.println("Boom >> shooting " + bullet);

        } else {
            System.out.println("Empty magazine");
        }
        return;

    }
}
