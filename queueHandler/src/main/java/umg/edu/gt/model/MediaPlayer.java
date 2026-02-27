package umg.edu.gt.model;

import umg.edu.gt.data_structure.queue.manual.QueueLinked;

public class MediaPlayer {
	private QueueLinked<Song> MusicList = new QueueLinked<>();
	
	public MediaPlayer(QueueLinked<Song> MusicList)
	{
		this.MusicList = MusicList;
	}
	
	public int reproduce(QueueLinked<Song> MusicList, int startingCount) {
		int contador = startingCount;
		while (!MusicList.isEmpty()) {
			Song song = MusicList.peek();
			int duration = song.getDuration();
			Logging.log("Song #" + contador + " - Playing: " + song.getTitle());

			for (int i = 0; i <= duration; i++) {
				try { Thread.sleep(1000); } catch (Exception e) { Thread.currentThread().interrupt(); }

				int progress = (i * 20) / duration;
				String bar = "====================".substring(0, progress) + "                    ".substring(progress);
				Logging.log("[" + bar + "] " + i + "/" + duration + "s");
			}
			Logging.log("\nFinished: " + song.getTitle() + "\n");
			MusicList.dequeue();
			contador++;
		}
		return contador;
	}
	

}
