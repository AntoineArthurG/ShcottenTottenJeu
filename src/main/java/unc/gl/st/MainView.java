package unc.gl.st;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.Route;

@Route
@Tag("st-main")
public class MainView extends HtmlContainer {
    
    public MainView() {
        this.add("Hello World");
        
        //A changer pour lancer une nouvelle partie avec le splitLayout (en 2 pour commmencer, en plus de sous partie plus tard)
        //Creer une classe layout peut etre ? 
        Button newGame = new Button("New Game", e-> Notification.show("New game!"));
        add(newGame);

        Board gameBoard = new Board();

        /*
        Label label = new Label("border");
        Label label2 = new Label("border 2");
        Image img = new Image("C:/Users/hilar/OneDrive/Desktop/Schotten-Totten-Starter-master/downloaded/TuileBorne/1cf37a.png","Une borne / frontière");
        //add(img);

        SplitLayout layout = new SplitLayout();
        layout.addToPrimary(label, img);
        layout.addToSecondary(label2);

        //add(layout);
        */
        
    }
    

    
}
