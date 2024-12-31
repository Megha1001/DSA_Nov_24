package hashing.moreThanNByKOccurrences;

/*
 * When we have n/k very small then creation of Hash is not a good idea
 * 
 * LOGIC : Use Extended Moore's algorithm
 * ---------------------------------------
 * Input arr = {30,10,20,202,02,10,40,30,30}
 * k=4, n=9
 * 
 * Let 'res_count' be the number of elements then
 *      res_count <= k-1
 *  Proof : If its not the case then for example we have res_count with k res_count
 *      k*(n/k+1) whose occurrence is slightly (+1) more than n/k
 *      --> k*(n/k+1) <= n
 *      --> n+k <=n
 *      --> k<=0 --> not possible
 * 
 */

public class PrintElementsWithMoreThanNByKOccurrencesWithTwist {
    
}
