import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    List<Integer> data;

    public BinarySearch(){
        data = new ArrayList<>();
    }
    public int search(int value){
        int length = ((data.size()) - 1);
        int location = length;
        int location_checker = length;
        int piece_start = 0;
        while (data.get(location_checker) != value){
            if(data.get(location_checker) > value){
                length = location_checker;
            }
            else{
                if(data.get(location_checker) < value) {
                    piece_start = location_checker;
                }
            }
            location_checker = piece_start + ((length - piece_start) / 2);
            if(data.get(location_checker) == value){
                location = location_checker;
            }
        }
        return location;
    }
    public void add(int value){
        if(data.size() == 0){
            data.add(value);
        }else{
            if(data.get(0) >= value){
                data.add(0, value);
            }else{
                int length = ((data.size()) - 1);
                if(data.get(length) <= value){
                    data.add(value);
                }else{
                    int location = length/2;
                    int location_checker = length/2;
                    int piece_start = 0;
                    boolean location_found = false;
                    while (!location_found){
                        if(data.get(location_checker) <= value && data.get(location_checker+1) >= value){
                            location = location_checker;
                            location_found = true;
                            break;
                        }
                        if(data.get(location_checker) > value){
                            length = location_checker;
                        }
                        else{
                            if(data.get(location_checker) < value) {
                                piece_start = location_checker;
                            }
                        }
                        location_checker = piece_start + ((length - piece_start) / 2);
                    }
                    data.add(location+1, value);
                }
            }
        }
    }
}
