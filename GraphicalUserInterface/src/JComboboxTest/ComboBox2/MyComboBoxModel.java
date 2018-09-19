package JComboboxTest.ComboBox2;

import javax.swing.*;
import java.util.Vector;

public class MyComboBoxModel extends DefaultComboBoxModel<Country> {
    public MyComboBoxModel(Vector<Country>[] item){
        //  super(item);
    }

    @Override
    public Vector<Country> getSelectedItem(){
        Vector selectedCountry = (Vector<Country>)super.getSelectedItem();

        return selectedCountry;
    }

}
