package com.distkv.asyncclient;


/**
 * The DistkvAsyncClient class is used to connect to the distkv server
 * and do operations asynchronously.
 */
public interface DistkvAsyncClient {

  /**
   * Connect to distkv server.
   *
   * @return True if succeeded to connect, otherwise it's false.
   */
  boolean connect();

  /**
   * Whether the client connected to distkv server.
   *
   * @return True if it connected, otherwise it's false.
   */
  boolean isConnected();

  /**
   * Disconnect to distkv server.
   */
  boolean disconnect();

  /**
   * Active a namespace for this client.
   */
  void activeNamespace(String namespace);

  /**
   * Deactivate the already achieved Namespace
   */
  void deactiveNamespace();

  String getActivedNamespace();

  /**
   * Get the dst string proxy.
   *
   * @return The dst string proxy.
   */
  DistkvAsyncStringProxy strs();

  /**
   * Get the dst list proxy.
   *
   * @return The dst list proxy.
   */
  DistkvAsyncListProxy lists();

  /**
   * Get the dst set proxy.
   *
   * @return The dst set proxy.
   */
  DistkvAsyncSetProxy sets();

  /**
   * Get the dst dict proxy.
   *
   * @return The dst string proxy.
   */
  DistkvAsyncDictProxy dicts();

  /**
   * Get the dst sortedList proxy.
   *
   * @return The dst sortedList proxy.
   */
  DistkvAsyncSortedListProxy sortedLists();

  /**
   * Get the distkv int proxy
   *
   * @return The distkv int proxy
   */
  DistkvAsyncIntProxy ints();
}
