public class AreaTriangulo {
    public class AreaTriangulo {
        public static void main(String[] args) {
            Scanner teclado =new Scanner(System.in);
            System.out.println("PROGRAMA PARA CALACULAR EL AREA DE  UN TRIANGULO");
            System.out.println("INGRESE EL VALOR DE LA BASE");
            double base = teclado.nextDouble();
            System.out.println("Ingrese el valor de la altura");
            double altura = teclado.nextDouble();//leemos un valor desde el teclado
            double area = (base*altura)/2;
            double resultado = Math.round(area);
            System.out.println("EL AREA DEL TRIANGULO: "+ area);
}
