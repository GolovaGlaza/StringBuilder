package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CustomStringBuilder sb = new CustomStringBuilder("Привет");
        System.out.println(sb);

        sb.append(", Мир!");
        System.out.println(sb);

        sb.delete(0, 6);
        System.out.println(sb);

        sb.undo();
        System.out.println(sb);

    }
}