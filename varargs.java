//java program for passing multiple variables from class a to b;
public class obj1{
   public static void main(){
      Display obj = new Display();
      obj.show(1,2,3,4,5);
      }
    }
    
    class Display{
      public void show(int ... a){
      for(int i : a){
      System.out.println(i);
      }
     }
    }
