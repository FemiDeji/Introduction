/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
class MethodsProject {
    public int addNumbers(int x, int y){
        int addition = x + y;
        return addition;
    }
    public static void main(String[] args){
        int i = 15;
        int j = 30;
        MethodsProject obj = new MethodsProject();
        int result  = obj.addnumbers(i, j);
        System.out.println("Sum of both numbers is:" +result);

    private int addnumbers(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
