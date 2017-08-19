/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * File:   newsimpletest1.c
 * Author: sayan
 *
 * Created on 11 August, 2016, 9:34 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * Simple C Test Suite
 */



int main(int argc, char** argv) {
    char s1[100];
    char s2[100];
    int i,c[26],d[26],n,m,p,q,j;

    printf("Enter your first string:\n");
    gets(s1);
    printf("Enter your second string:\n");
    gets(s2);
    n = strlen(s1);
    m = strlen(s2);
    for(i=0;i<26;i++)
    {
        c[i]=0;
        d[i]=0;
    }
    if(n!=m)
        printf("The given string is not equal");
    else
    {
        for(i=0;i<n;i++)
        {
            p=s1[i]-'a';
            c[p]++;
        }
        for(j=0;j<m;j++)
        {
            q=s2[j]-'a';
            d[q]++;
        }
        for(i=0;i<26;i++)
        {
            if(c[i]!=d[i])
            {
                printf("The string are not matched");
                break;
            }
            if(i==25)
                printf("String are matched");
        }
    }


    return (EXIT_SUCCESS);
}
