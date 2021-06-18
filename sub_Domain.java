import java.util.Arrays;

public class sub_Domain {

    public static void main(String[] args) {

        int desired_subDomains = 9;
        int board_size = 225;
        double N = Math.sqrt(board_size / desired_subDomains);

        int [] initial_x = {};
        int [] initial_y = {};

        int [] x = {};
        int [] y = {};


        //Generation of values required
        for (int i = 0; i < Math.sqrt(desired_subDomains); i++){
            initial_x = Arrays.copyOf(initial_x, initial_x.length + 1);
            initial_x[initial_x.length - 1] = (i * (int)N);

            initial_y = Arrays.copyOf(initial_y, initial_y.length + 1);
            initial_y[initial_y.length - 1] = (i * (int)N);

        }
        //Generation of X
        for (int i = 0; i < initial_x.length; i++) {
            for (int j = 0; j < initial_x.length; j++) {
                x = Arrays.copyOf(x, x.length + 1);
                x[x.length - 1] = (initial_x[i]);
            }
        }

        //Generation of Y
        for (int i = 0; i < Math.sqrt(desired_subDomains); i++){
            for(int j = 0; j < initial_y.length; j++){
                y = Arrays.copyOf(y, y.length + 1);
                y[y.length - 1] = (initial_y[j]);
            }
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
}


