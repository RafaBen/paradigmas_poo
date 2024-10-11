package service;

import java.util.List;

import util.Animal;

public class Som {

    public void som(){
        System.out.println("O animal faz um som: ");
    }

    public static void emitirSons(List<Som> animais){
        for (Som animal : animais ){
            animal.som();
        }
    }

}
