package com.d2mp.conversor.principal;

import com.d2mp.conversor.control.MenuPpal;

public class Conversor {
    public static void main(String[] args) {
        int opcion = 0;

        MenuPpal menuPpal = new MenuPpal();
        while(opcion != 9)
            opcion = menuPpal.showMenu();
    }
}
