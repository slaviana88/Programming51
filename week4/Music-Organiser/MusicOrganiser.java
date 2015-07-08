package com.hackbulgaria.programming51.week4;

import com.hackbulgaria.programming51.week3.Vector;

public class MusicOrganiser {
	Vector<Song> songs = new Vector();

	public void addSong(Song s) {
		songs.add(s);
	}

	public String toString() {
		System.out.println("All songs: ");
		return songs.toString();
	}

	public int getCount() {
		return songs.getSize();
	}

	public Vector<String> getAlbums() {
		Vector<String> albums = new Vector<String>();
		for (int i = 0; i < getCount(); i++) {
			if (albums.contains(songs.get(i).getAlbum())) {
				continue;
			}
			albums.add(songs.get(i).getAlbum());
		}
		return albums;
	}

	public int getAlbumsCount(){
		return getAlbums().getSize();
	}
	
	public Vector<Song> getAlbumSongs(String albumName){
		Vector<Song> albumSongs = new Vector<Song>();
		for(int i=0;i<getCount();i++){
			if(songs.get(i).getAlbum().equals(albumName)){
				albumSongs.add(songs.get(i));
			}
		}
		return albumSongs;
	}
	
	public Vector<String> getAlbumsAndSongs(){
		Vector<String> result = new Vector<String>();
		for(int i = 0; i < getAlbumsCount(); i++){
			String album = getAlbums().get(i) + " (" + getAlbumsCount() + ")";
			result.add(album);
		}
		return result;
	}
}

