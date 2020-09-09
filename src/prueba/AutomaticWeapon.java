/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author mfigueroa
 */
public class AutomaticWeapon {

    private static final int BURST_FIRE_ROUNDS = 3;
    private static final int AUTO_FIRE_ROUNDS = 5;
    private int ammo;

    public AutomaticWeapon(int ammo) {
        this.ammo = ammo;
    }

    @MultipleInvocation
    public void singleFire() {
        ammo--;
        System.out.println("Single fire! Ammo left: " + ammo);
    }

    @MultipleInvocation(timesToInvoke = BURST_FIRE_ROUNDS)
    public void burstFire() {
        ammo--;
        System.out.println("Burst fire! Ammo left: " + ammo);
    }

    @MultipleInvocation(timesToInvoke = AUTO_FIRE_ROUNDS)
    public void autoFire() {
        ammo--;
        System.out.println("Auto fire! Ammo left: " + ammo);
    }

}
