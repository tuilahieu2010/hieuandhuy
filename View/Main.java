/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Common.Library;
import Controller.SearchProgramming;
import Model.Element;

/**
 *
 * @author hieu
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        element.setSize_array(library.getInt("Enter number you want array (1 - 1000)", 1, 1000));
        element.setArray(library.createArray(element.getSize_array()));
        new SearchProgramming(element).run();
    }
}
