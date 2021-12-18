package jp.ac.uryukyu.ie.e215737;

public class Main{
    public static void main(String[] args) throws NullPointerException{
        String str = null;
        try{
                System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("エラー : NullPointerException");
            System.out.println(e.getMessage());
        }
        
            
    }
}