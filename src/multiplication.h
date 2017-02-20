#ifndef __MULT_H
#define __MULT_H

#include <stdio.h>
#include <iostream>
#include <iomanip>
#include <time.h>
#include <cstdlib>
#include <omp.h>

#define SYSTEMTIME clock_t

void OnMultLine(int m_ar, int m_br);
void OnMult(int m_ar, int m_br);

#endif