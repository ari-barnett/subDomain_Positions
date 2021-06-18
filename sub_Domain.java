import java.util.Arrays;

public class sub_Domain {

    public static void main(String[] args) {

        int subDomainX_slices = 2;
        int subDomainY_slices = 3;
        int desired_subDomains = (subDomainX_slices * subDomainY_slices);

        int x_dimension = 15;
        int y_dimension = 10;

        int board_size = x_dimension * y_dimension;
        double xN = x_dimension / subDomainY_slices;
        double yM = y_dimension / subDomainX_slices;

        int [] initial_x = {};
        int [] initial_y = {};

        int [] x = {};
        int [] y = {};


        //Generation of values required
        for (int i = 0; i < subDomainY_slices; i++){
            initial_x = Arrays.copyOf(initial_x, initial_x.length + 1);
            initial_x[initial_x.length - 1] = (i * (int)xN);

        }

        for (int i = 0; i < subDomainX_slices; i++){
            initial_y = Arrays.copyOf(initial_y, initial_y.length + 1);
            initial_y[initial_y.length - 1] = (i * (int)yM);
        }
        //Generation of X
        for (int i = 0; i < initial_x.length; i++) {
            for (int j = 0; j < subDomainX_slices; j++) {
                x = Arrays.copyOf(x, x.length + 1);
                x[x.length - 1] = (initial_x[i]);
            }
        }

        //Generation of Y
        for (int i = 0; i < subDomainY_slices; i++){
            for(int j = 0; j < initial_y.length; j++){
                y = Arrays.copyOf(y, y.length + 1);
                y[y.length - 1] = (initial_y[j]);
            }
        }
        System.out.println("Boardsize of " + board_size);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
}
