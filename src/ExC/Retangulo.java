package ExC;

public class Retangulo {

    private final double largura;
    private final double comprimento;

    public Retangulo(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double getLargura() {return largura;}
    public double getComprimento() {return comprimento;}

    public Retangulo(double lado) {
    //  |ALT|
    //  this(lado, lado)
        this.largura = lado;
        this.comprimento = lado;
    }

    public double gerArea(){
        return largura*comprimento;
    }

    public double getPerimetro(){
        return largura*2+comprimento*2;
    }

    public double getDiagonal(){
        return Math.hypot(largura, comprimento);
    //    |ALT|
    //    double soma = Math.pow(largura, 2) + Math.pow(comprimento, 2);
    //    return  Math.sqrt(soma);
    }

    public boolean isQuadrado(){
        if(largura == comprimento){
            return true;
        }
        else {return false;}
    }
    //  |ALT|
    //  return largura == comprimento;

}