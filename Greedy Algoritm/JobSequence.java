import java.util.*;

public class JobSequence {

    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p) { // Constructor
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs =new ArrayList<>();

        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));

        }
        Collections.sort(jobs, (onj1,obj2) -> obj2.profit-onj1.profit);
        // Desending order of profit (2-1) for Ascending vise versa (1-2)

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline> time){
                seq.add(curr.id);
                time++;
            }
        }

        // Print Seq
        System.out.println("Job Sequence: "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();

    }
}
