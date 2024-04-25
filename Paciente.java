class Paciente{
    String nombre, apellido;
    int nss;
    Paciente(){
        System.out.println("SE ESTA CONSTRUYENDO EL PACIENTE");
    }

    public void MostrarNombre(){
        System.out.println("Mi nombre es " + this.nombre +" " + this.apellido);
    }
        
    public void MostrarNSS(){
        System.out.println("Mi NSS es " + this.nss);
    }
        
}