FROM docker:dind  
RUN apk add --no-cache git bash  
COPY run_benchmark.sh /run_benchmark.sh  
RUN chmod +x /run_benchmark.sh  
ENTRYPOINT ["/run_benchmark.sh"]
 
