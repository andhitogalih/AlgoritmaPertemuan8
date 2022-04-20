public class belanja {
    int top, size, jmlBrg, totalHrg;
    String noTrans, waktu;
    belanja[] stack;

    public belanja(String noTrans, int jmlBrg, int totalHrg, String waktu){
        this.noTrans = noTrans;
        this.jmlBrg = jmlBrg;
        this.totalHrg = totalHrg;
        this.waktu = waktu;
    }

    public belanja(int size){
        this.size = size;
        this.top =-1;
        stack = new belanja[this.size];
    }

    public boolean IsEmpty(){
        if(top <= -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if(top >= size-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(belanja stk){
        if(!IsFull()){
            top++;
            stack[top] = stk;
        }else{
            System.out.println("Data sudah full!");
        }
    }

    public void pop(){
        if(!IsEmpty()){
            belanja st = stack[top];
            top--;
            line(50);
            System.out.printf("Nomor Transaksi: %-10s\n", st.noTrans);
            System.out.printf("Tanggal: %-20s\n", st.waktu);
            line(50);
            System.out.printf("Jumlah Barang: %-6d\n", st.jmlBrg);
            System.out.printf("Total: Rp. %d\n", st.totalHrg);
            line(50);
        }
    }
    
    public void line (int pjg){
        for(int i=0; i<pjg; i++){
            System.out.print("=");
        }
        System.out.println();
    }
    
    public void print(){
        line(50);
        System.out.println("\t\t   ISI STACK                   ");
        line(50);
        for(int i=top; i>=0; i--){
            line(50);
            System.out.printf("Nomor Transaksi: %-10s\n", stack[i].noTrans);
            System.out.printf("Tanggal: %-20s\n", stack[i].waktu);
            line(50);
            System.out.printf("Jumlah Barang: %-6d\n", stack[i].jmlBrg);
            System.out.printf("Total: Rp. %d\n", stack[i].totalHrg);
            line(50);
        }
        System.out.println();
    }
}


