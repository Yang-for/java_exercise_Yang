package com.experiment_P.p5;

public class View  {
    private String name;
    public View(String name) {
        this.name = name;
    }

    public void click() {
        System.out.println("Button");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Button extends View{
        private Clickable clickable;

        public Button(String name) {
            super(name);
        }

        public void setClickable(Clickable button) {
            this.clickable = button;
        }

        public Clickable getLearnable() {
            return this.clickable;
        }
    }
}


