import java.util.Scanner;

public class Main {
    private static Timer time = new Timer();


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int op,line,col;

        do {
            System.out.println("1. Multiplication");
            System.out.println("2. Line Multiplication");
            System.out.println("Selection?:");
            op = keyboard.nextInt();
            if (op == 0)
                break;
            System.out.println("Dimensions: lins cols ? ");
            System.out.println("Line:  ");
            line = keyboard.nextInt();
            System.out.println("Col:  ");
            col = keyboard.nextInt();
            System.out.println("Processing...");

            switch (op){
                case 1:
                    OnMult(line, col);
                    break;
                case 2:
                    OnMultLine(line, col);

                    break;
            }
        }while (op != 0);
        System.out.println("Exit!");
    }

    @SuppressWarnings("Duplicates")
    static void OnMult(int m_ar, int m_br){
        int i, j, k;

        double pha[][] = new double[m_ar][m_br];
        double phb[][] = new double[m_ar][m_br];
        double phc[][] = new double[m_ar][m_br];

        for(i=0; i<m_ar; i++)
            for(j=0; j<m_ar; j++)
                pha[i][j] =1.0;



        for(i=0; i<m_br; i++)
            for(j=0; j<m_br; j++)
                phb[i][j] = i+1;



        time.Start();

        for(i=0; i<m_ar; ++i) {
            for( j=0; j<m_br; ++j) {
                for( k=0; k<m_ar; ++k) {
                    phc[i][j] += pha[i][k] * phb[k][j];
                }
            }
        }


        time.End();
        System.out.println("Time: "+time.getExecutionTime()+" seconds!");

        System.out.println("Result matrix:");

        for(i=0; i<1; i++)
        {	for(j=0; j<Math.min(10,m_br); j++)
            System.out.print(phc[i][j]+" ");
            System.out.println();
        }
    }

    @SuppressWarnings("Duplicates")
    static void OnMultLine(int m_ar, int m_br)
    {
        int i, j, k;

        double pha[][] = new double[m_ar][m_br];
        double phb[][] = new double[m_ar][m_br];
        double phc[][] = new double[m_ar][m_br];

        for(i=0; i<m_ar; i++)
            for(j=0; j<m_ar; j++)
                pha[i][j] =1.0;



        for(i=0; i<m_br; i++)
            for(j=0; j<m_br; j++)
                phb[i][j] = i+1;



        time.Start();

        for(i=0; i<m_ar; i++) {
            for( k=0; k<m_ar; k++) {
                for( j=0; j<m_br; j++) {
                    phc[i][j] += pha[i][k] * phb[k][j];
                }
            }
        }


        time.End();
        System.out.println("Time: "+time.getExecutionTime()+" seconds!");

        System.out.println("Result matrix:");

        for(i=0; i<1; i++)
        {	for(j=0; j<Math.min(10,m_br); j++)
            System.out.print(phc[i][j]+" ");
            System.out.println();
        }
    }

    /*PRODUTO INTERNO: FUNÇÃO NÂO USADA MAS A FAZER(?)*/
    /*float produtoInterno(float *v1, float *v2, int col)
    {
        int i;
        float soma=0.0;

        for(i=0; i<col; i++)
            soma += v1[i]*v2[i];

        return(soma);

    }*/




}


     /*   void handle_error (int retval)
        {
        printf("PAPI error %d: %s\n", retval, PAPI_strerror(retval));
        exit(1);
        }

        void init_papi() {
        int retval = PAPI_library_init(PAPI_VER_CURRENT);
        if (retval != PAPI_VER_CURRENT && retval < 0) {
        printf("PAPI library version mismatch!\n");
        exit(1);
        }
        if (retval < 0) handle_error(retval);

        std::cout << "PAPI Version Number: MAJOR: " << PAPI_VERSION_MAJOR(retval)
        << " MINOR: " << PAPI_VERSION_MINOR(retval)
        << " REVISION: " << PAPI_VERSION_REVISION(retval) << "\n";
        }
*/
