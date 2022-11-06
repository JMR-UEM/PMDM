fun main(arg: Array<String>){

    println("Indica cual es tu nombre")
    val nombre: String? = readLine();
    println("Indica cual es tu edad")
    val edad: Int = readLine()!!.toInt();
    val comienzo: Boolean = true;

    if (comienzo && edad >17){
        print("Bienvenido ${nombre} el curso comenzará")
    } else if (comienzo && edad<18) {
        println("Han dado consentimiento tus padres")
        val consentimiento: String? = readLine();
        if (consentimiento.equals("SI")) println("Perfecto ${nombre} podemos empezar")
    } else {
        println("No podemos empezar el curso")
    }

}
