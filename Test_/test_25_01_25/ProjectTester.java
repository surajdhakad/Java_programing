package test_25_01_25;


abstract class Project {
	    protected String projectName;
	    protected String projectManager;
	    protected static int totalNoOfProjects = 0;

	    public Project() {
	        incrementTotalNoOfProjects();
	    }

	    public Project(String projectName, String projectManager) {
	        this.projectName = projectName;
	        this.projectManager = projectManager;
	        incrementTotalNoOfProjects();
	    }

	    public synchronized static void incrementTotalNoOfProjects() {
	        totalNoOfProjects++;
	    }

	    public static int getTotalNoOfProjects() {
	        return totalNoOfProjects;
	    }

	    public abstract int getSuccessRate();
	}

	class DevelopmentProject extends Project {
	    private int requirementsMet;
	    private int bugsResolved;
	    private int onTimeDelivery;
	    private int successRate;
	    private boolean rateCalculated = false;

	    public DevelopmentProject(String projectName, String projectManager, int requirementsMet, int bugsResolved, int onTimeDelivery) {
	        super(projectName, projectManager);
	        this.requirementsMet = requirementsMet;
	        this.bugsResolved = bugsResolved;
	        this.onTimeDelivery = onTimeDelivery;
	    }

	    @Override
	    public synchronized int getSuccessRate() {
	        if (!rateCalculated) {
	         
	            successRate = (requirementsMet * 100) / (requirementsMet + bugsResolved + onTimeDelivery);
	            rateCalculated = true;
	            notifyAll(); 
	        }
	        return successRate;
	    }

	    public synchronized boolean isSuccessful() throws InterruptedException {
	        while (!rateCalculated) {
	            wait(); 
	        }
	        return successRate >= 75; 
	    }
	}

	class ResearchProject extends Project {
	    private int innovationScore;
	    private int resourceUtilization;
	    private int successRate;
	    private boolean rateCalculated = false;

	    public ResearchProject(String projectName, String projectManager, int innovationScore, int resourceUtilization) {
	        super(projectName, projectManager);
	        this.innovationScore = innovationScore;
	        this.resourceUtilization = resourceUtilization;
	    }

	    @Override
	    public synchronized int getSuccessRate() {
	        if (!rateCalculated) {
	          
	            successRate = (innovationScore * 100) / (innovationScore + resourceUtilization);
	            rateCalculated = true;
	            notifyAll(); 
	        }
	        return successRate;
	    }

	    public synchronized boolean isSuccessful() throws InterruptedException {
	        while (!rateCalculated) {
	            wait(); 
	        }
	        return successRate >= 70; 
	    }
	}

	public class ProjectTester {
	    public static void main(String[] args) {
	        DevelopmentProject devProject = new DevelopmentProject("Project A", "John", 90, 10, 95);
	        ResearchProject resProject = new ResearchProject("Project B", "Sarah", 85, 15);

	        Thread devThread = new Thread(() -> {
	            int successRate = devProject.getSuccessRate();
	            try {
	                boolean successful = devProject.isSuccessful();
	                System.out.println("Development Project: " + devProject.projectName);
	                System.out.println("Success Rate: " + successRate);
	                System.out.println("Successful: " + (successful ? "Yes" : "No"));
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread resThread = new Thread(() -> {
	            int successRate = resProject.getSuccessRate();
	            try {
	                boolean successful = resProject.isSuccessful();
	                System.out.println("Research Project: " + resProject.projectName);
	                System.out.println("Success Rate: " + successRate);
	                System.out.println("Successful: " + (successful ? "Yes" : "No"));
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        devThread.start();
	        resThread.start();

	        try {
	            devThread.join();
	            resThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Total Number of Projects: " + Project.getTotalNoOfProjects());
	    }
	}
	