import java.util.List;

public class BinarySearch {

    List<Integer> data;

    public BinarySearch(List<Integer> list){
        data = list;
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
}
