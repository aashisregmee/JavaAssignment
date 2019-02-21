import java.applet.Applet;
import java.awt.*;

public class TextAreaDemo extends Applet implements TextListener
{
  //  TextArea echo1;
  //  TextArea echo2;

    
    TextArea echo1 = new TextArea(2, 40);

    TextArea echo2 =  new TextArea(2, 40);
    
   public  void init(){
        LayoutManager layout = new LayoutManager();
        setLayout(layout);

        echo1.addTextListener (this);   //registered here
        echo2.setEditable(false);
        add(echo1);
        add(echo2);

         echo.setText("Enter text in this area and watch ");
    
        }
       void textValueChanged(TextEvent e)
       {
           String  entry = echo1.getText();
           echo2.setText(entry);
       }
       public static void main(String[] args) {
           TextAreaDemo td= new TextAreaDemo();
       }


 
}