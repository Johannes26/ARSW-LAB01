package edu.eci.arsw.threads;

import java.util.LinkedList;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

public class BlackListValidatorThread extends Thread {

	private String host;
	private int ipstart;
	private int ipfinish;
	private static final int BLACK_LIST_ALARM_COUNT = 5;
	private int ocurrencesCount = 0;
	private int checkedListCount = 0;
	private HostBlacklistsDataSourceFacade skds = HostBlacklistsDataSourceFacade.getInstance();
	private LinkedList<Integer> blackListOcurrences;

	public BlackListValidatorThread(String host, int ipstart, int ipfinish) {

		this.host = host;
		this.ipstart = ipstart;
		this.ipfinish = ipfinish;
		blackListOcurrences = new LinkedList<>();
	}

	public void run() {

		for (int i = ipstart; i <= ipfinish && ocurrencesCount < BLACK_LIST_ALARM_COUNT; i++) {
			checkedListCount++;
			if (skds.isInBlackListServer(i, host)) {

				blackListOcurrences.add(i);

				ocurrencesCount++;
			}
		}
		System.out.println(ipfinish);
	}



	public int getOcurrencesCount() {
		return ocurrencesCount;
	}
	
	public int getCheckedListCount() {
		return checkedListCount;
	}
	
	public LinkedList<Integer> getBlackListOcurrences() {
		return blackListOcurrences;
	}

}