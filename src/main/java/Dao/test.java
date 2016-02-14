package Dao;



import java.util.Collection;

import org.apache.taglibs.standard.tag.common.xml.ForEachTag;
import org.com.entities.Compte;
import org.com.entities.Transaction;
import org.com.entities.Utilisateur;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.support.DaoSupport;

import Batch.BatchLauncher;
import antlr.collections.List;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Batch/batch-context.xml");
		
		//Aprés Ajout de la classe BatchLauncher et avant l'ajout du skidler
		
//		BatchLauncher batLauncher=(BatchLauncher) context.getBean("batchLauncher");
//		try {
//			batLauncher.run();
//		} catch (JobExecutionAlreadyRunningException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JobRestartException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JobInstanceAlreadyCompleteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JobParametersInvalidException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		
		
		//Avant ajout de la classe BatchLauncher

//			JobLauncher jobLauncher=(JobLauncher) context.getBean("jobLauncher");
//			Job job =(Job) context.getBean("importTransactions");
//			try {
//				jobLauncher.run(job, new JobParameters());
//			} catch (JobExecutionAlreadyRunningException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (JobRestartException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (JobInstanceAlreadyCompleteException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (JobParametersInvalidException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		UtilisateurDaoImp dao1=new UtilisateurDaoImp();
//		CompteDaoImp dao=new CompteDaoImp();
//		//TransactionDaoImp dao2=new TransactionDaoImp();
//		Utilisateur u=new Utilisateur();
//		u=dao1.findById(1);
//		Compte c=new Compte();
//		c=dao.findById(8);
//		dao.updateSolde(c, 1515);
//}
//		//Transaction t=new Transaction();
//		//t=dao2.findById(1);
//		//System.out.println("date"+t.getDateTransaction());
	
		
		


	

