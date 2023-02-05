import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Expresso", "Iced Coffee", "Macchiato"};
        menu[2] = "Latte";
        String menuString = Arrays.toString(menu);
        System.out.println(menuString);
        String[] newMenu = new String[5];

        for(int i=0;i<menu.length;i++){
            System.out.println(i + ". " +menu[i]);
            System.out.println();
            newMenu[i] = menu[i];
        }
        System.out.println(Arrays.toString(newMenu));
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }
    
}
