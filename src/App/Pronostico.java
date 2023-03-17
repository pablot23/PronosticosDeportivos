package App;

public class Pronostico {

    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultadoPronosticado;



    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultadoPronosticado ) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultadoPronosticado = resultadoPronosticado;

    }
    public int getPuntos() {
        int puntos = 0;
        if (partido.getResultado(equipo) == ResultadoEnum.GANADOR) {
            puntos = 1;
        }
        if (partido.getResultado(equipo) == ResultadoEnum.PERDEDOR) {
            puntos = 0;
        }
        if (partido.getResultado(equipo) == ResultadoEnum.EMPATE) {
            puntos = 1;
        }
        return puntos;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    public Partido getPartido() {
        return this.partido;
    }
    public Equipo getEquipo() {
        return this.equipo;
    }
    public ResultadoEnum getResultadoPronosticado() {
        return this.resultadoPronosticado;
    } 
    public void setResultadoPronosticado(ResultadoEnum resultadoPronosticado) {
        this.resultadoPronosticado = resultadoPronosticado;
    }


}

