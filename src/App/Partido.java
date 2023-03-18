package App;
import java.util.ArrayList;
import java.util.List;


public class Partido {
    private int rondaNro;
    private int matchNro; 
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
   

    public Partido(Equipo equipoUno, Equipo equipoDos, int goles1, int goles2, int  rondaNro, int matchNro) {
        this.equipo1 = equipoUno;
        this.equipo2 = equipoDos;
        this.golesEquipo1 = goles1;
        this.golesEquipo1 = goles2; 
        this.rondaNro = rondaNro;
        this.matchNro = matchNro;
    }

    public ResultadoEnum getResultado(Equipo equipo) {

        if (this.golesEquipo1 > this.golesEquipo2) {
            if (this.equipo1 == equipo) {
                return ResultadoEnum.GANADOR;
            } else {
                return ResultadoEnum.PERDEDOR;
            }
        } else if (this.golesEquipo1 < this.golesEquipo2) {
            if (this.equipo2 == equipo) {
                return ResultadoEnum.GANADOR;
            } else {
                return ResultadoEnum.PERDEDOR;
            }
        } else {
            return ResultadoEnum.EMPATE;
        }

    }
    
    public int getMatchNro() {
        return this.matchNro;
    }
    public int getRondaNro() {
        return this.rondaNro;
    }
    public Equipo getEquipo1() {
        return this.equipo1;
    }
    public Equipo getEquipo2() {
        return this.equipo2;
    }
    public int getGolesEquipo1() {
        return this.golesEquipo1;
    }
    public int getGolesEquipo2() {
        return this.golesEquipo2;
    }
    public void setGolesEquipo1(int goles) {
        this.golesEquipo1 = goles;
    }
    public void setGolesEquipo2(int goles) {
        this.golesEquipo2 = goles;
    }
    public void setEquipo1(Equipo equipo) {
        this.equipo1 = equipo;
    }
    public void setEquipo2(Equipo equipo) {
        this.equipo2 = equipo;
    }
    public void setMatchNro(int nro) {
        this.matchNro = nro;
    }

    public void setRondaNro(int rondaNro) {
        this.rondaNro = rondaNro;
    }



    
}