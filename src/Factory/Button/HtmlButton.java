package Factory.Button;

import Factory.Button.Button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Test Factory.Factory.Button.Button.Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Factory.Factory.Button.Button.Button says - 'Hello World!'");
    }
}
