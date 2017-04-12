package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;
import Model.Model;
import View.View;

public class Controller {
    private Model solver;
    private View view;

    public Controller(){
        view = new View(new NextStep());
        solver = new Model();
    }

    public class NextStep implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList<Stack<Integer>> discs = solver.getDiscs();
            view.display(discs);
        }
    }
}
