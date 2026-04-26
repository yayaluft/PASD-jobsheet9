public class StackSurat10 {
    Surat10[] stack;
    int size;
    int top;

    public StackSurat10(int size){
        this.size =size;
        stack = new Surat10[size];
        top =-1;
    }
    public boolean isFull(){
        if (top== size -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(Surat10 surat){
        if(!isFull()){
            top++;
            stack[top]=surat;
        } else{
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }
    public Surat10 pop(){
        if(!isEmpty()){
            Surat10 s = stack[top];
            top--;
            return s;
        } else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Surat10 peek(){
        if(!isEmpty()){
            return stack[top];
        } else{
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }
    public void print(){
        for (int i=top; i >= 0; i--){
            System.out.println("--Surat Ke-"+i+"--");
            System.out.println("ID Surat    : "+stack[i].idSurat);
            System.out.println("Nama        : "+stack[i].namaMahasiswa);
            System.out.println("Kelas       : "+stack[i].kelas);
            System.out.println("Jenis Izin  : "+(stack[i].jenisIzin == 'S' ? "Sakit" : "Izin"));
            System.out.println("Durasi      : "+stack[i].durasi + " hari");
        }
    }
    public void cariSurat(String nama){
        boolean ditemukan = false;
        for (int i =top; i >= 0; i--){
            if(stack[i].namaMahasiswa.equalsIgnoreCase(nama)){
                System.out.println("ID Surat    : "+stack[i].idSurat);
                System.out.println("Nama        : "+stack[i].namaMahasiswa);
                System.out.println("Kelas       : "+stack[i].kelas);
                System.out.println("Jenis Izin  : "+(stack[i].jenisIzin == 'S'? "Sakit": "Izin"));
                System.out.println("Durasi      : "+stack[i].durasi+" hari");
                ditemukan=true;
            }
        }
        if(!ditemukan){
            System.out.println("Surat izin tidak ditemukan.");
        }
    }
}
