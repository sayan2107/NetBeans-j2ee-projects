/* 
 * File:   1.c
 * Author: sayan
 * Created on 9 August, 2016, 9:01 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
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

    return 0;
}

