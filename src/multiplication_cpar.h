#ifndef __CPAR_H
#define __CPAR_H

#include <stdio.h>
#include <iostream>
#include <iomanip>
#include <time.h>
#include <cstdlib>
#include <omp.h>


#define SYSTEMTIME clock_t

void OnMultLineCPAR(int m_ar, int m_br);
void OnMultCPAR(int m_ar, int m_br);

#endif