public class OverClock {

    void increaseCpuClock(Computer comp, double upCpu){
        comp.proc.clocking= comp.proc.clocking+upCpu;
    }

    void decreaseCpuClock(Computer comp, double downCpu){

        comp.proc.clocking=comp.proc.clocking-downCpu;

    }
}
