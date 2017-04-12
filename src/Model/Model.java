package Model;

import java.util.ArrayList;
import java.util.Stack;

public class Model {
    private ArrayList<Stack<Integer>> discs;
    private int index;
    private int previousPush;

    public Model(){
        discs = new ArrayList<>();
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);
        discs.add(new Stack<>());
        discs.add(new Stack<>());
        discs.add(new Stack<>());
        index = 0;
        previousPush = -1;
    }

    public void nextStep(){
        if(discs.get(2).size() == 4){
            return;
        }
        if(discs.get(index).isEmpty()){
            index = nextBar(index);
        }
        if(index != previousPush){
            Integer aux = discs.get(index).peek();
            if(checkNext(nextBar(index))){
                discs.get(nextBar(index)).push(aux);
                previousPush = nextBar(index);
                discs.get(index).pop();
            }
            else if(checkNext(nextBar(nextBar(index)))){
                discs.get(nextBar(nextBar(index))).push(aux);
                previousPush = nextBar(nextBar(index));
                discs.get(index).pop();
            }
            else{
                index = nextBar(index);
            }
        }
        else{
            index = nextBar(index);
        }
    }

    private int nextBar(int i){
        i++;
        if(i > 2) i = 0;
        return i;
    }

    private boolean checkNext(int i){
        if(!discs.get(i).isEmpty())
            if(discs.get(i).peek() > discs.get(index).peek())
                return true;

        return false;
    }

    public ArrayList<Stack<Integer>> getDiscs() {
        return discs;
    }
}
