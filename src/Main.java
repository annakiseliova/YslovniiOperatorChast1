public class Main {
    public static void main(String[] args) {
        //Задание 3
        System.out.println("Задание 3");
        int wagonCapacity = 102;
        int sitPlace = 60;
        int place = 105;
        if(place <= sitPlace){
            System.out.println("В вагоне есть сидячее место");
        }
        if(place > sitPlace && place <= wagonCapacity ){
            System.out.println("В вагоне нет сидячих мест, есть только стоячее место");
        }
        if(place > wagonCapacity){
            System.out.println("Мест нет, вагон полностью забит");
        }
    }
}







