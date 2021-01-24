package edu.eci.arsw.threads;

import java.util.LinkedList;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

public class BlackListValidatorThread extends Thread {

	private String host;
	private int ipstart;
	private int ipfinish;
	private static final int BLACK_LIST_ALARM_COUNT = 5;
	int ocurrencesCount = 0;
	int checkedListsCount = 0;
	HostBlacklistsDataSourceFacade skds = HostBlacklistsDataSourceFacade.getInstance();
	LinkedList<Integer> blackListOcurrences = new LinkedList<>();

	public BlackListValidatorThread(String host, int ipstart, int ipfinish, int ocurrencesCount, int checkedListsCount,
			HostBlacklistsDataSourceFacade skds, LinkedList<Integer> blackListOcurrences) {

		this.host = host;
		this.ipstart = ipstart;
		this.ipfinish = ipfinish;
		this.ocurrencesCount = ocurrencesCount;
		this.checkedListsCount = checkedListsCount;
		this.skds = skds;

	}

	public void run() {

		for (int i = ipstart; i < ipfinish && ocurrencesCount < BLACK_LIST_ALARM_COUNT; i++) {
			checkedListsCount++;
			if (skds.isInBlackListServer(i, host)) {

				blackListOcurrences.add(i);

				ocurrencesCount++;
			}
		}
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getIpstart() {
		return ipstart;
	}

	public void setIpstart(int ipstart) {
		this.ipstart = ipstart;
	}

	public int getIpfinish() {
		return ipfinish;
	}

	public void setIpfinish(int ipfinish) {
		this.ipfinish = ipfinish;
	}

	public int getOcurrencesCount() {
		return ocurrencesCount;
	}

	public void setOcurrencesCount(int ocurrencesCount) {
		this.ocurrencesCount = ocurrencesCount;
	}

	public int getCheckedListsCount() {
		return checkedListsCount;
	}

	public void setCheckedListsCount(int checkedListsCount) {
		this.checkedListsCount = checkedListsCount;
	}

	public LinkedList<Integer> getBlackListOcurrences() {
		return blackListOcurrences;
	}

	public void setBlackListOcurrences(LinkedList<Integer> blackListOcurrences) {
		this.blackListOcurrences = blackListOcurrences;
	}

}