public class Main {
    public static void main(String[] args) {
//dizi oluşturma ve kullanacağımız değişkenleri atama
        int[] array={1,2,3,4,5,6,7,8,9,10};
        double harmonicAvr;
        double sum = 0;
// harmonic sayı formülü uygulama
        for (int j:array){
            sum+=1.0/j;
        }
        harmonicAvr=array.length/sum;
        // print
        System.out.println("Harmonik ortalama : " + harmonicAvr);
    }
}