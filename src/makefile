all: compiler

compiler: aula1.cpp
	mkdir ../bin
	g++ -O2 aula1.cpp multiplication.cpp multiplication_cpar.cpp -lpapi -fopenmp -o ../bin/aula1

clean:
	rm -rf *o *d aula1