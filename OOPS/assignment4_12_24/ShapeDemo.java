package assignment4_12_24;




public class ShapeDemo {

    public static void main(String[] args) {
       
        shape r = shape.randshape(); 

        
        if (r instanceof Circle) {
            r.draw();
            r.erase();
        } else if (r instanceof Square) {
            r.draw();
            r.erase();
        } else if (r instanceof Tringle) { 
            r.draw();
            r.erase();
        } else {
            r.draw();
            r.erase();
        }
    }
}