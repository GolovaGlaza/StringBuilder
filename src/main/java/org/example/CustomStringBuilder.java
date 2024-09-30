package org.example;

import java.util.Stack;

public class CustomStringBuilder {

    private StringBuilder currentState;
    private Stack<Snapshot> history;

    public CustomStringBuilder(String initialString){
        this.currentState = new StringBuilder(initialString);
        this.history = new Stack<>();
    }

    private void saveState() {
        history.push(new Snapshot(currentState.toString()));
    }

    public CustomStringBuilder append(String str){
        saveState();
        currentState.append(str);
        return this;
    }

    public CustomStringBuilder delete(int start, int end){
        saveState();
        currentState.delete(start, end);
        return this;
    }

    public void undo(){
        if (!history.isEmpty()){
            Snapshot lastSnapshot = history.pop();
            currentState = new StringBuilder(lastSnapshot.getState());
        } else {
            System.out.println("Нечего отменять");
        }
    }

    @Override
    public String toString() {
        return currentState.toString();
    }
}
