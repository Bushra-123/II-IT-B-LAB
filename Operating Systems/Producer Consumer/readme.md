Aim:

To write a  C Program for the Implementation of Producer Consumer Problem.

Algorithm:
     Semaphore fullBuffers("full",0) // initially, no messages
     
      Semaphore emptyBuffers("empty", BUFF_SIZE); // the size of the round buffer    
      
      Semaphore mutex("ring",1);         // no one accesses the ring buffer
     
      Producer() {
        emptyBuffers.P();                                  // check if there's slot for more messages
         
        mutex.P();                                               // make sure no one else is accessing the ring buffer
         
        put one message in the ring buffer

        mutex.V();                                              // ok for others to use the ring buffer

        fullBuffers.V();                                      // tell consumers there's a new message in the ring buffer
      }                  

      Consumer() {
        fullBuffers.P();                                       // check if there's a message in the ring buffer

        mutex.P();                                               // make sure no one else is accessing the ring buffer
     
        take one message out

        mutex.V();                                               // others' turn to use the ring buffer
                        
        emptyBuffers.V();                                  // tell producer  more messages are needed
       }
