package Factory.Dialog;

import Factory.Button.Button;
import Factory.Button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
