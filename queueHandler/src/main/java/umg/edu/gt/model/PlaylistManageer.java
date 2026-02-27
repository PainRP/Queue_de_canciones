package umg.edu.gt.model;

import umg.edu.gt.data_structure.queue.manual.QueueLinked;

public class PlaylistManageer {
	private QueueLinked<Song> HighPriorityPlaylist = new QueueLinked<>();
	private QueueLinked<Song> NormalPriorityPlaylist = new QueueLinked<>();
	
	public PlaylistManageer(QueueLinked<Song> HighPriorityPlaylist, QueueLinked<Song> NormalPriorityPlaylist) 
	{
		this.HighPriorityPlaylist = HighPriorityPlaylist;
		this.NormalPriorityPlaylist = NormalPriorityPlaylist;
	}

	
	public void addSong(Song song) 
	{
		if (song.getPriority() == 1) 
		{
			HighPriorityPlaylist.enqueue(song);
		} else {
			NormalPriorityPlaylist.enqueue(song);
		}
	}
	
	
	
}
