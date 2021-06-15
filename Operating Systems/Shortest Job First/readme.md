b) SJF (Shortest Job First)

Aim: Write a C program to implement the various process scheduling mechanisms such as SJF

Scheduling.Algorithm:
1: Start the process
2: Accept the number of processes in the ready Queue
3: For each process in the ready Q, assign the process id and accept the CPU burst time 4: Start
the Ready Q according the shortest Burst time by sorting according to lowest to highest burst
time.
5: Set the waiting time of the first process as ‘0’ and its turnaround time as its burst time.
6: For each process in the ready queue, calculate
(a) Waiting time for process(n)= waiting time of process (n-1) + Burst time of process(n-1)

(b) Turn around time for Process(n)= waiting time of Process(n)+ Burst time for process(n)
7: Calculate

(c) Average waiting time = Total waiting Time / Number of process
• Average Turnaround time = Total Turnaround Time / Number of process
 8: Stop the process
